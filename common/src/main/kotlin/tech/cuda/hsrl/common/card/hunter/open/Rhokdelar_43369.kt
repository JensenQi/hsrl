package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rhokdelar_43369 : Card() {
    override val id = 43369
    override val name = "伦鲁迪洛尔"
    override val description = "<b>战吼：</b>如果你的牌库里没有随从牌，则随机将猎人的法术牌置入你的手牌，直到你的手牌数量达到上限。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "迷人的西蒙妮，疯狂的克林弗兰，毁灭者阿特留斯和屠杀者索伦诺尔觉得这件武器很棒。"
    override val artist = "Trent Kaniuga & James Martin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2a2cb8524d33e8435e05be388990f9ebab1f6f27429709408d182be322af6c64.png"
}
