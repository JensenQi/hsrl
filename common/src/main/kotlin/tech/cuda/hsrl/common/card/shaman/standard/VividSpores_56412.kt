package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VividSpores_56412 : Card() {
    override val id = 56412
    override val name = "鲜活孢子"
    override val description = "使你的所有随从获得“<b>亡语</b>：再次召唤该随从。”"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "兄弟，我总是感觉……死亡其实是由我们的幻觉构成的，你明白吗？"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/356597bd0f45448852d1c52d38a66c97ce1a3a51980a4a2cd190942cbf2c4a9f.png"
}
