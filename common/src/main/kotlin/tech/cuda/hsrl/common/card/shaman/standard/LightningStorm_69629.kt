package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightningStorm_69629 : Card() {
    override val id = 69629
    override val name = "闪电风暴"
    override val description = "对所有敌方随从造成 3点伤害，<b>过载：</b>（2）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "恐怕打伞是没有用的。"
    override val artist = "Christopher Moeller"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69590a811150a00818bc29c9b0208eee7bd6d9b2e6ce589d948270b6daeda207.png"
}
