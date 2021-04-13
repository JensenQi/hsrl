package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Corpsetaker_46102 : Card() {
    override val id = 46102
    override val name = "夺尸者"
    override val description = "<b>战吼：</b> 如果你的牌库里包含具有<b>嘲讽</b>的随从牌，则获得<b>嘲讽</b>。依此法检定是否可获得<b>圣盾</b>、<b>吸血</b>和<b>风怒</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "她的藏尸涉猎广泛，囊括了几乎所有类型的尸体。她也很乐意把你加入她的藏品。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fbe8b917b7ecad0bd803b13d179898bccd671e0ab7cbdf4d5e86ff6044a9bec3.png"
}
