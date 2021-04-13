package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LorekeeperPolkelt_60278 : Card() {
    override val id = 60278
    override val name = "博学者普克尔特"
    override val description = "<b>战吼：</b>将你的牌库按法力值消耗由高到低重新排序。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "quicksort [] = [] quicksort (x:xs) = quicksort small ++ (x : quicksort large) where small = [y | y <- xs, y <= x] large = [y | y <- xs, y > x]"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e63302a519920a0741b1ddf34f27ae15ae0265d021ca651b8a4b847a690c15f9.png"
}
