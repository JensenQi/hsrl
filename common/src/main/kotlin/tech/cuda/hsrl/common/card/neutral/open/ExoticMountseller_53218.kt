package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExoticMountseller_53218 : Card() {
    override val id = 53218
    override val name = "特殊坐骑商人"
    override val description = "每当你施放一个法术，随机召唤一个法力值消耗为（3）的 野兽。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "*拍了拍猛犸象的鞍袋* “这能装下不少松鼠呢！”"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/03bb653e4d7f6860e158f7c19c1f83b7a35f522e4572c985c2fccb40fdda82ce.png"
}
