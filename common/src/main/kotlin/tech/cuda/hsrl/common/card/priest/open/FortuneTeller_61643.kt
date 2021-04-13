package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FortuneTeller_61643 : Card() {
    override val id = 61643
    override val name = "占卜机"
    override val description = "<b>嘲讽，战吼：</b> 你手牌中每有一张法术牌，便获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“我预见到了你长大后的情景……一架巨大的钢琴。”"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6df82b14c21da5b5344e75f4bf98538c6ce86d6569636a56854553d14bef0fe9.png"
}
