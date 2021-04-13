package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OasisThrasher_62705 : Card() {
    override val id = 62705
    override val name = "绿洲长尾鳄"
    override val description = "<b>暴怒：</b>对敌方英雄造成3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "绿洲水是淡水，绿洲鳄却不是淡水鳄。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/64bc0cc8526617a3757d82c24728c035e4f00cfad9ca1fc6d0edffb5494a6f39.png"
}
