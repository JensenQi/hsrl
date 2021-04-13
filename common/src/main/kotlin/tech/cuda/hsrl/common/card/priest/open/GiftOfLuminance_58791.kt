package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GiftOfLuminance_58791 : Card() {
    override val id = 58791
    override val name = "流光之赐"
    override val description = "使一个随从获得<b>圣盾</b>，并召唤一个1/1的复制。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "圣光会赐给你一份小纪念品，一个小雪花球，里面装着微缩版的你。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dc51b27b9c87d304d034ce04bcaaceff112701bdbb655e65f1fca50bd444148b.png"
}
