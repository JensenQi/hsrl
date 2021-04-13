package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaCyclone_52706 : Card() {
    override val id = 52706
    override val name = "法力飓风"
    override val description = "<b>战吼：</b>你在本回合中每施放过一个法术，便随机将一张法师法术牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "让你的法术转起来！"
    override val artist = "Ware Li"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c74f900b58c16851cbdad7a0bb225d980e0aa61352ebe66c5dd0affbef0e796.png"
}
