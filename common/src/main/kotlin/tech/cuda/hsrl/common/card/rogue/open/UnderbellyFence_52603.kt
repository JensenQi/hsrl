package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnderbellyFence_52603 : Card() {
    override val id = 52603
    override val name = "下水道销赃人"
    override val description = "<b>战吼：</b>如果你手牌中有另一职业的卡牌，则获得+1/+1和<b>突袭</b>。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "她这儿什么都有——除了底线和职业道德。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/230c54e513f9dc7f594e1c08b5bef4ae76698e2d1fb525f8f707d36d42fe42ed.png"
}
