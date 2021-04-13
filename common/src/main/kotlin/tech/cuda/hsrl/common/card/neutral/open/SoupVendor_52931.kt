package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoupVendor_52931 : Card() {
    override val id = 52931
    override val name = "汤水商贩"
    override val description = "每当你为你的英雄恢复3点及以上生命值时，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "就地取材，都是竞技场里刚抬出来的！"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c3980c9a91abd24e72718894891d444178991ed82e99b52a0dcb9709e20c9f59.png"
}
