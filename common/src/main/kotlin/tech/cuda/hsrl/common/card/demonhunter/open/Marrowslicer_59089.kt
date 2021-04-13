package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Marrowslicer_59089 : Card() {
    override val id = 59089
    override val name = "切髓之刃"
    override val description = "<b>战吼：</b>将两张灵魂残片洗入你的 牌库。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "非常适合用来对付冰冠堡垒的第一个首领。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c36dd2081d1e61f9e3da1c42e217d985cf94dc5f4a8885a6944099ff085abff.png"
}
