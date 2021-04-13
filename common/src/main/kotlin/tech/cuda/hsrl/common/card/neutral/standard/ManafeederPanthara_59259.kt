package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManafeederPanthara_59259 : Card() {
    override val id = 59259
    override val name = "食魔影豹"
    override val description = "<b>战吼：</b>在本回合中，如果你使用过你的英雄技能，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "主要食物有法力，水晶猫粮，还有你吃了一半的零食。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c253687cc760668be068bce3944408ec15e503c4f3f109a1495b91a15d5e1665.png"
}
