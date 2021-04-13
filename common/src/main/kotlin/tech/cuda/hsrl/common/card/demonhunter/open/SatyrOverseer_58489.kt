package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SatyrOverseer_58489 : Card() {
    override val id = 58489
    override val name = "萨特监工"
    override val description = "在你的英雄攻击后，召唤一个2/2的萨特。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "他是缺乏沟通技巧，但他可以调动快速响应人员。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/de9179136f535d980c326beb221463afc585329b7a38dcd044e815c308462fb6.png"
}
