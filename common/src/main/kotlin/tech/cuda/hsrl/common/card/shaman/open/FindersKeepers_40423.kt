package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FindersKeepers_40423 : Card() {
    override val id = 40423
    override val name = "先到先得"
    override val description = "<b>发现</b>一张具有<b>过载</b>的牌。 <b>过载：</b> （1）"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "这是我的！"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c840bf4e2b5293d0051f26062b5c48c333dc0ec64f383651d1725a3529ef2a19.png"
}
