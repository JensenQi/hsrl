package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RecklessDiretroll_50863 : Card() {
    override val id = 50863
    override val name = "粗暴的恐怖巨魔"
    override val description = "<b>嘲讽，战吼：</b>弃掉你手牌中法力值消耗最低的牌。"
    override var cost: Int? = 3
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“随地弃牌怎么了，因为我没素质啊！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/50732e98d93407570442addfb2f5f7662416d4f8fa937975d8eaa50f6554116e.png"
}
