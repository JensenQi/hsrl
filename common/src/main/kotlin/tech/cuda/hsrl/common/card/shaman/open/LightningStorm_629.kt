package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightningStorm_629 : Card() {
    override val id = 629
    override val name = "闪电风暴"
    override val description = "对所有敌方随从造成 3点伤害，<b>过载：</b>（2）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "恐怕打伞是没有用的。"
    override val artist = "Christopher Moeller"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bb7b5a450a44569cf757d2e8d46fad8f32f68a16290268b6eba65fb56e252d8f.png"
}
