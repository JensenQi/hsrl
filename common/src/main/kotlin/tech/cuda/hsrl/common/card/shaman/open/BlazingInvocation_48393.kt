package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlazingInvocation_48393 : Card() {
    override val id = 48393
    override val name = "炽焰祈咒"
    override val description = "<b>发现</b>一张具有<b>战吼</b>的随从牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.TheWitchwood
    override val background = "越来越多的萨满祭司开始用图腾来抽水烟。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc5af02617712f3cf037d4186403670f20ff785731c12f2d72852ebafd6dd0b6.png"
}
