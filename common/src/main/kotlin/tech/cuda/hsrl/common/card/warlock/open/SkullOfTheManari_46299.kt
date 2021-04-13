package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkullOfTheManari_46299 : Card() {
    override val id = 46299
    override val name = "堕落者之颅"
    override val description = "在你的回合开始时，从你的手牌中召唤一个 恶魔。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "不要相信死人的头颅。"
    override val artist = "Matthew O'Connor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d4ab1e0724e8b8f401df3a660b7c24a2214da3cf33d28270751444d1df036ca1.png"
}
