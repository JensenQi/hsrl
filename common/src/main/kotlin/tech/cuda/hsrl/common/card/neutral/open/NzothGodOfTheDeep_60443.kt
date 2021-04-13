package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NzothGodOfTheDeep_60443 : Card() {
    override val id = 60443
    override val name = "恩佐斯，深渊之神"
    override val description = "<b>战吼：</b>随机复活每个随从类型的各一个友方随从。"
    override var cost: Int? = 10
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "它真的只是想抱一抱艾泽拉斯的各种小生物。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ce033367ba641573301fe8dea2becf6ad6831dfbb064f5a2c2d79348504f11d7.png"
}
