package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathRevenant_42392 : Card() {
    override val id = 42392
    override val name = "死亡幽魂"
    override val description = "<b>战吼：</b>每有一个受伤的随从，便获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "大家都还好吗？有人受伤了？有人流血了？有人骨折了？……那太好了。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4d467d449d583dd92e69cbab77d702f599e171ba35d63c795b1ebe48b92f5017.png"
}
