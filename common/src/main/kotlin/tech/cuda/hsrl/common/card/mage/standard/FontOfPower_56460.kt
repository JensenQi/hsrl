package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FontOfPower_56460 : Card() {
    override val id = 56460
    override val name = "能量之泉"
    override val description = "<b>发现</b>一张法师随从牌。如果你的牌库中没有随从牌，则保留全部三张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "来自晶歌森林的天然好水。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c2d633250dd95f7dc4271a3222889f9550ee631fb101112b322402f8dc4860f.png"
}
