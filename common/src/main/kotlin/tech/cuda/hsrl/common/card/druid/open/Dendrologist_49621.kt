package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Dendrologist_49621 : Card() {
    override val id = 49621
    override val name = "树木学家"
    override val description = "<b>战吼：</b>如果你控制一个树人，<b>发现</b>一张法术牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "他试着教树人说话，可小家伙只学会了一句“I am Gloop”。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5d82cfcb6b5afd3c298e68c2c1460935776cd3b22926a4740b76e7c2578838f8.png"
}
