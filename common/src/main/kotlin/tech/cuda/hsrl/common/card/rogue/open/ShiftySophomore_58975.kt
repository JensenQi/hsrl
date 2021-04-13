package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShiftySophomore_58975 : Card() {
    override val id = 58975
    override val name = "调皮的大二学妹"
    override val description = "<b>潜行，法术迸发：</b>将一张<b>连击</b>牌置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "稍有资历便调皮，资历尚浅露形迹。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ed8a934e54124d02b8363e373ac14f1a59c1e38847872e3f357bbcf468312918.png"
}
