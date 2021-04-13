package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Xavius_556 : Card() {
    override val id = 556
    override val name = "萨维斯"
    override val description = "在你使用一张牌后，召唤一个2/1的萨特。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "萨维斯怀着召唤萨格拉斯的宏伟噩梦，但他现在要从召唤萨特做起。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b187673d6b42d230a57edc5fccf10bae8e3a12b1fcb50491a06059f0a595c869.png"
}
