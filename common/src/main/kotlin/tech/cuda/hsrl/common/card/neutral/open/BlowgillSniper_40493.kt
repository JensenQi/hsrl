package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlowgillSniper_40493 : Card() {
    override val id = 40493
    override val name = "吹箭鱼人"
    override val description = "<b>战吼：</b>造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "有一次他吹得太用力，把门牙都给崩了出去。"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/49c4390d6cc77a98c30530447c24adaf88c7c40912ce1368f4a13031d619b0fe.png"
}
