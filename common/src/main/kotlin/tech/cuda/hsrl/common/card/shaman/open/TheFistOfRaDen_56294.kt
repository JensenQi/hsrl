package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheFistOfRaDen_56294 : Card() {
    override val id = 56294
    override val name = "莱登之拳"
    override val description = "在你施放一个法术后，召唤一个法力值消耗相同的<b>传说</b>随从。失去1点耐久度。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "强大的莱登以风暴守护者的身份闻名于世。可悲的是，他连自己的拳套都守护不住。"
    override val artist = "Katherine Fortune"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5ff11c66c3b657c951d3956973fcc4546259b2e099da67d3055640c9e961e42c.png"
}
