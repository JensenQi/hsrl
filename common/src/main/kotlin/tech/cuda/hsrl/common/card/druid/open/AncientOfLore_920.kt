package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientOfLore_920 : Card() {
    override val id = 920
    override val name = "知识古树"
    override val description = "<b>抉择：</b>抽两张牌；或者恢复 5点生命值。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "去吧，把你的名字刻在树皮上。"
    override val artist = "Patrik Hjelm"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c8aded19f3eca0b8f5183328aeb387ce33e514de050fb8faca333549f683534.png"
}
