package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MicroMummy_53445 : Card() {
    override val id = 53445
    override val name = "微型木乃伊"
    override val description = "<b>复生</b> 在你的回合结束时，随机使另一个友方随从获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "精雕细刻，精湛工艺，至真精品，惊世再现。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/334c8f66b783a30683d9babeb014049a45aa0d40724bfa1132757dbb99a60561.png"
}
