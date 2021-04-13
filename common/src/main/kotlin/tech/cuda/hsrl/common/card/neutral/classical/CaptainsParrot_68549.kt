package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CaptainsParrot_68549 : Card() {
    override val id = 68549
    override val name = "船长的鹦鹉"
    override val description = "<b>战吼：</b>从你的牌库中抽一张海盗牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "海盗和鹦鹉形影不离，就像兔妖和胡萝卜。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eaef291d1fc3e8296da56745a84f354fc2de7f38acb10c1cd25d74233dda03a4.png"
}
