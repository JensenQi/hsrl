package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoblinBlastmage_1934 : Card() {
    override val id = 1934
    override val name = "地精炎术师"
    override val description = "<b>战吼：</b>如果你控制任何机械，则造成4点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Gvg
    override val background = "如果你实在找不到炸弹了，那就随便找一个地精发明的东西，然后把它扔出去……"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/049b4861688ea38c033640664e77d6533c3a54c0329151fbd82ac7978f3c037c.png"
}
