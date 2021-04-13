package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FacelessShambler_38569 : Card() {
    override val id = 38569
    override val name = "无面蹒跚者"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>复制一个友方随从的攻击力和生命值。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "无面者最让人艳羡的一点就是，高矮胖瘦想变就变！"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/467510b370fd38ec0b20e5e04c497216cd5514fc21a288d4f59c5ad4243a7ee2.png"
}
