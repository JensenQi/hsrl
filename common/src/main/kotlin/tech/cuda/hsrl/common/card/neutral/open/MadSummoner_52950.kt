package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MadSummoner_52950 : Card() {
    override val id = 52950
    override val name = "疯狂召唤师"
    override val description = "<b>战吼：</b>为双方玩家召唤数个1/1的小鬼，直到随从数量达到上限。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "他是因为疯了才召唤小鬼，还是因为召唤出了小鬼才疯了的？"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a3b07566281999bd0311e299c7e31c9953c901af5e23030114ca9ef167773c12.png"
}
