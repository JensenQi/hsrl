package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SiInfiltrator_69669 : Card() {
    override val id = 69669
    override val name = "军情七处渗透者"
    override val description = "<b>战吼：</b>随机摧毁一个敌方<b>奥秘</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "这次渗透要破坏的目标是什么？是个秘密！"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2b8a1ca92a2f45af925590ad231e763b046cefda596187c82c1940517fd6bc53.png"
}
