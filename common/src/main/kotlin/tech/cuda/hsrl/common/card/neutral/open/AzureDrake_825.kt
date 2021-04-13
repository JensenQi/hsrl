package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AzureDrake_825 : Card() {
    override val id = 825
    override val name = "碧蓝幼龙"
    override val description = "<b>法术伤害+1</b>，<b>战吼：</b>抽一张牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "它们本来应该是宝蓝色或是蔚蓝色，但这几个颜色显得有点太耀眼了。"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d1d96dfbc7ad89119d376071a773842103d4b7a0cb4fcc71ce460baccdf92ae4.png"
}
