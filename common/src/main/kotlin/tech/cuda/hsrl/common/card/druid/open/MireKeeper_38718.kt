package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MireKeeper_38718 : Card() {
    override val id = 38718
    override val name = "泥潭守护者"
    override val description = "<b>抉择：</b>召唤一个2/2的泥浆怪；或者获得一个空的法力水晶。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Wotog
    override val background = "金窝银窝不如自己的泥潭，说什么也不会卖的！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba261157857f90ccb8fa5ba610964e8242cbc1f5e9fe3ab9b2c3a312ead70376.png"
}
