package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HoardPillager_55400 : Card() {
    override val id = 55400
    override val name = "藏宝匪贼"
    override val description = "<b>战吼：</b>装备一把你的被摧毁的武器。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "不如我们破剑重圆吧！"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ea5b418ec09dad4cd837fd68d777775f069aa720b140fe1c1fc0b91d123e8b0d.png"
}
