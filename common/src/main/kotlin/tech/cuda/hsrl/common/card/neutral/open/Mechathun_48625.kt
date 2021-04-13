package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mechathun_48625 : Card() {
    override val id = 48625
    override val name = "机械克苏恩"
    override val description = "<b>亡语：</b> 如果你的牌库、手牌和战场没有任何牌，消灭敌方英雄。"
    override var cost: Int? = 10
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“所有用户都将弃你而去……连你的软件都背叛了你……我苏醒之日，便是你过气之时。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a519d6e9ac5d9849fd5e82620a011245c045937f98d803475ce149f6d4d43429.png"
}
