package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RockpoolHunter_41245 : Card() {
    override val id = 41245
    override val name = "石塘猎人"
    override val description = "<b>战吼：</b>使一个友方鱼人获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "他虽然怕螃蟹，却喜欢吃螃蟹肉。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/61090969899bcd1a93c7bfb5ea07bcf8f0133591996c9d13167c6533ab905183.png"
}
