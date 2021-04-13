package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CaptainsParrot_530 : Card() {
    override val id = 530
    override val name = "船长的鹦鹉"
    override val description = "<b>战吼：</b>从你的牌库中抽一张海盗牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "海盗和鹦鹉形影不离，就像兔妖和胡萝卜。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/66289a053b7afc1b54fc296a94e901fd1311b3dd6b6f2a105ad0f4baa322b7d0.png"
}
