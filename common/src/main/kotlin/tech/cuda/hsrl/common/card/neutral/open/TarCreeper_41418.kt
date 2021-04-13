package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TarCreeper_41418 : Card() {
    override val id = 41418
    override val name = "焦油爬行者"
    override val description = "<b>嘲讽</b> 在你对手的回合获得+2攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "它爬过的地方，路都出奇地好走。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eaba2c459407a0847345de0de5a5efecb0bd3a5b8860019384b5fb28e175fb77.png"
}
