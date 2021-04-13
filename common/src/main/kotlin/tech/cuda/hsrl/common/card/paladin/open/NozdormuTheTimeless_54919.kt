package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NozdormuTheTimeless_54919 : Card() {
    override val id = 54919
    override val name = "时光巨龙诺兹多姆"
    override val description = "<b>战吼：</b> 将双方玩家的法力水晶重置为十个。"
    override var cost: Int? = 4
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "时间就是法力！"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/01606c64349dc8ce7e56449a22d5d1b00f24f3bb6ace919a4ede1ab6c831940f.png"
}
