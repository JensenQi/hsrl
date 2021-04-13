package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WyrmrestAgent_2596 : Card() {
    override val id = 2596
    override val name = "龙眠教官"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便获得+1攻击力和<b>嘲讽</b>。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Tgt
    override val background = "对五位强大的守护巨龙来说，观看锦标赛是当下的头等大事！"
    override val artist = "Jeff Easley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a47eb0590db810c39ec9872f829cca0236e9f738654ce1bb4ff3dad5df6d683a.png"
}
