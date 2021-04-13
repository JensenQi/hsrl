package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bandersmosh_55643 : Card() {
    override val id = 55643
    override val name = "班德斯莫什"
    override val description = "如果这张牌在你的手牌中，每个回合都会随机变成一张<b>传说</b>随从牌的5/5的复制。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "他最拿手的还是模仿沙德沃克。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/38695710dcd2607d753e5af8ec8d6f3106f5dd3c485f6934cafa770bb2120cc0.png"
}
