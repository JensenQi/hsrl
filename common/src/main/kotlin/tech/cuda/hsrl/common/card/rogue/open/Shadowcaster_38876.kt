package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowcaster_38876 : Card() {
    override val id = 38876
    override val name = "暗影施法者"
    override val description = "<b>战吼：</b>选择一个友方随从，将它的一张1/1的复制置入你的手牌，其法力值消耗为（1）点。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Wotog
    override val background = "由于学艺不精，暗影施法者所复制的随从块头都变小了。不过正好可以当玩偶收藏在橱柜里。"
    override val artist = "J. Meyers & A. Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/94c0043d67c1dac9a5845ac50b6292dfe2c03954667299b18e62d3eb704f3c51.png"
}
