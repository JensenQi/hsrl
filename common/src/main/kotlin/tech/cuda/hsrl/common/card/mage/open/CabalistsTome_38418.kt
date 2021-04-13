package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CabalistsTome_38418 : Card() {
    override val id = 38418
    override val name = "秘法宝典"
    override val description = "随机将三张法师法术牌置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Wotog
    override val background = "秘法宝典？说不定里面有制作魔法点心的食谱……"
    override val artist = "Milivoj Ceran"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb1e5ee52251025e3d7347590712b9cb572f109188fbdd184175253002d50e93.png"
}
