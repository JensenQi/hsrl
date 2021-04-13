package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CaptainGreenskin_456 : Card() {
    override val id = 456
    override val name = "绿皮船长"
    override val description = "<b>战吼：</b>使你的武器获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "要不是因为那些调皮捣蛋的小家伙们，他差点就把那艘超级战舰开进暴风城港口了！"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c6d45395ba8c5394639537a39ea80c978f60bc82c9675cca07b285f85f103162.png"
}
