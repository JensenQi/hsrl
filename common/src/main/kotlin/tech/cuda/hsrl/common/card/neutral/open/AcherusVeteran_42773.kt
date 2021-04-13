package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AcherusVeteran_42773 : Card() {
    override val id = 42773
    override val name = "阿彻鲁斯老兵"
    override val description = "<b>战吼：</b>使一个友方随从获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "这是我的符文剑。有很多类似的符文剑，但是这把符文剑是我的。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa14c87e47c5efee286c19ad0dcba27fc04c4c9cfef0ef6e41c7c97bef6b9db4.png"
}
