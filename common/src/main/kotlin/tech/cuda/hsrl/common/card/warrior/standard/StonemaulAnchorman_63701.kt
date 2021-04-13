package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StonemaulAnchorman_63701 : Card() {
    override val id = 63701
    override val name = "石槌掌锚手"
    override val description = "<b>突袭</b>，<b>暴怒：</b>抽一张牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“无论你在这个羊皮纸框里写什么，随便写，布鲁格都会认真研读。”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9c15a2a082cd7e5d52e0b7c1b78527ad138fac2694b9d3ec9f4834222eeebfd0.png"
}
