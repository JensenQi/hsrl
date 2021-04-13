package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TomeOfIntellect_52262 : Card() {
    override val id = 52262
    override val name = "智慧秘典"
    override val description = "随机将一张法师法术牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "秘术的合订本就是秘典。"
    override val artist = "Derk Venneman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a8c860c38c93139964a5a6cd28f82ec4080a0be409ff4ced4560741d437cfc11.png"
}
