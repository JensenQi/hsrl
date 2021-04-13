package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Recombobulator_2076 : Card() {
    override val id = 2076
    override val name = "侏儒变形师"
    override val description = "<b>战吼：</b> 将一个友方随从随机变形成为一个法力值消耗相同的随从。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "他坚信物质守恒的定律，更痴迷于魔法的随机性。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/551a0a45000355f544f50119917ce7ea1ee68a7c29fa41a51c07368a27137e08.png"
}
