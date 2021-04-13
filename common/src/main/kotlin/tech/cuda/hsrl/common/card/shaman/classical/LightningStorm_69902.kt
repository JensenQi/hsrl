package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightningStorm_69902 : Card() {
    override val id = 69902
    override val name = "闪电风暴"
    override val description = "对所有敌方随从造成 2到 3点伤害，<b>过载：</b>（2）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "恐怕打伞是没有用的。"
    override val artist = "Christopher Moeller"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b471eed5f587b7c2e89f584bb7476b87ce00e25b5976c984d5fe168c8aacc441.png"
}
