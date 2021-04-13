package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IxlidFungalLord_45859 : Card() {
    override val id = 45859
    override val name = "伊克斯里德，真菌之王"
    override val description = "在你使用一张随从牌后，召唤一个该随从的复制。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "好的宠物会陪伴你成长，糟糕的宠物会长到你身上。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a4ba8b8cfe2a88feabfa521a5b8b1e427ea5636b6dfb5db690b04e7fa10752b.png"
}
