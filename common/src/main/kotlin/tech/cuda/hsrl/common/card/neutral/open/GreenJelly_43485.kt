package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GreenJelly_43485 : Card() {
    override val id = 43485
    override val name = "绿色凝胶怪"
    override val description = "在你的回合结束时，召唤一个1/2并具有<b>嘲讽</b>的软泥怪。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "这是一张名副其实的“超模”卡，都从模子里溢出来了。"
    override val artist = "Anton Kagounkin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7643385417bc82d5bc976a61c279eae3f529bda6356352223e6bf263f5ae33ed.png"
}
